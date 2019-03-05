package qa.automated.web.bci.Launcher;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import qa.automated.web.bci.Runnings.RunningLoginUFTAppium;
import qa.automated.web.bci.Runnings.RunningPagoDeCuentasUFTAppium;

@RunWith(Suite.class)
@SuiteClasses({RunningLoginUFTAppium.class, RunningPagoDeCuentasUFTAppium.class})

public class LauncherPagosApps extends ApplicationLauncherAndroid {

}
