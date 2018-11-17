package uk.co.ribot.foodalike.injection.component;

import dagger.Subcomponent;
import uk.co.ribot.foodalike.injection.PerActivity;
import uk.co.ribot.foodalike.injection.module.ActivityModule;
import uk.co.ribot.foodalike.ui.main.MainActivity;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
