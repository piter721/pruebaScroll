package qa.automated.web.bci.Launcher;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import qa.automated.web.bci.Runnings.RunningAliexpress;

@RunWith(Suite.class)
@SuiteClasses({RunningAliexpress.class})

public class LauncherAliexpress extends ApplicationLauncherAndroid {

}
