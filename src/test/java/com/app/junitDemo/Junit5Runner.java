package com.app.junitDemo;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.platform.runner.JUnitPlatform;

@SuppressWarnings("deprecation")
@RunWith(JUnitPlatform.class)
//@SelectPackages({"my2junitTest","myjunitTest"})

//@SelectClasses(ParametrizedTest.class)
@SelectClasses({com.app.junitDemo.IncludeExcludeTags.class})
@IncludeTags({"prod"})
public class Junit5Runner {

}
