package com.ebizu.zoukebc;

import java.util.List;

import com.ebizu.zoukebc.StoryMap;

import net.serenitybdd.jbehave.SerenityStories;

public class RunnerTestSuite extends SerenityStories {
    private static final String STORY_PACKAGE = "stories/";
    private static final String LOGIN = "a.login";
    private static final String PROMO = "b.promotions";
    private static final String EVENTS = "c.events";
    private static final String PRODUCTS = "d.products";
    private static final String ROOMS = "e.rooms";

    private final StoryMap storyMap = new StoryMap();

    public RunnerTestSuite()
    {
        //use method storyPaths from parent class (override)
        storyMap.put(super.storyPaths());

        //<editor-fold>
        {
            //TEST
//        	storyMap.addWhiteListPackage(STORY_PACKAGE + LOGIN);
//        	storyMap.addWhiteListPackage(STORY_PACKAGE + PROMO);
//        	storyMap.addWhiteListPackage(STORY_PACKAGE + EVENTS);
//        	storyMap.addWhiteListPackage(STORY_PACKAGE + PRODUCTS);
        	storyMap.addWhiteListPackage(STORY_PACKAGE + ROOMS);


        }
        //</editor-fold>


        /**
         * WARNING !!
         * SET THE VALUE OF WHITE LIST CONFIGURATION BELOW TO FALSE BEFORE COMMIT TO SVN.
         */
        storyMap.setUseWhiteList(true);
    }

    @Override
    public List<String> storyPaths()
    {
        return storyMap.getSortedStoryPath();
    }

}
