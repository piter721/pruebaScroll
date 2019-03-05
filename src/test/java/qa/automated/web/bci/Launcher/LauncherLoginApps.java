package qa.automated.web.bci.Launcher;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import qa.automated.web.bci.Runnings.RunningLoginUFTAppium;

@RunWith(Suite.class)
@SuiteClasses({RunningLoginUFTAppium.class})

public class LauncherLoginApps extends ApplicationLauncherAndroid {

}
