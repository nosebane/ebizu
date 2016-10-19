package com.ebizu.zoukebc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StoryMap {
	 private final TreeMap<String,List<String>> map = new TreeMap<String, List<String>>();
	    private final List<String> listOfWhiteListPackage = new ArrayList<String>();
	    private final List<String> listOfWhiteListStory = new ArrayList<String>();
	    private boolean useWhiteList;

	    public StoryMap(){}

	    public void put(List<String> listOfStoryPath)
	    {
	        for(String storyPath : listOfStoryPath)
	        {
	            put(storyPath);
	        }
	    }

	    public void put(String storyPath){
	        int index = storyPath.lastIndexOf('/');
	        String packageFolder = storyPath.substring(0,index);
	        String story = storyPath.substring(++index,storyPath.length());
	        put(packageFolder, story);
	    }

	    public void put(String packageFolder, String story){
	        List<String> listOfStory = map.get(packageFolder);

	        if(listOfStory==null)
	        {
	            listOfStory = new ArrayList<String>();
	        }

	        if(story.toLowerCase().startsWith("add"))
	        {
	            story = ":1"+story;
	        }
	        else if(story.toLowerCase().startsWith("edit"))
	        {
	            story = ":2"+story;
	        }
	        else if(story.toLowerCase().startsWith("delete"))
	        {
	            story = ":3"+story;
	        }

	        listOfStory.add(story);
	        map.put(packageFolder,listOfStory);
	    }

	    public List<String> get(String packageFolder)
	    {
	        return map.get(packageFolder);
	    }

	    public void clear()
	    {
	        map.clear();
	        listOfWhiteListPackage.clear();
	    }

	    public List<String> getSortedStoryPath(){
	        List<String> storyPaths = new ArrayList<String>();

	        for(Map.Entry<String,List<String>> entry : map.entrySet())
	        {
	            String key = entry.getKey();

	            if(useWhiteList && !listOfWhiteListPackage.contains(key))
	            {
	                continue; //Skip story where not in white list.
	            }

	            List<String> listOfStory = entry.getValue();

	            if(listOfStory!=null)
	            {
	                Collections.sort(listOfStory);
	            }

	            for(String story : listOfStory)
	            {
	                String storyPath = key+'/'+story.replaceAll(":1|:2|:3","");

	                if(useWhiteList && !listOfWhiteListStory.isEmpty() && !listOfWhiteListStory.contains(storyPath))
	                {
	                    continue;
	                }

	                storyPaths.add(storyPath);
	            }
	        }
	        return storyPaths;
	    }

	    public void addWhiteListPackage(String packageFolder)
	    {
	        listOfWhiteListPackage.add(packageFolder);
	    }

	    public void setUseWhiteList(boolean useWhiteList)
	    {
	        this.useWhiteList = useWhiteList;
	    }

}
