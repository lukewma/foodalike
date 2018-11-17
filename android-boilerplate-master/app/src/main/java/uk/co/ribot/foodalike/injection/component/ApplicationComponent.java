package uk.co.ribot.foodalike.injection.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import uk.co.ribot.foodalike.data.DataManager;
import uk.co.ribot.foodalike.data.SyncService;
import uk.co.ribot.foodalike.data.local.DatabaseHelper;
import uk.co.ribot.foodalike.data.local.PreferencesHelper;
import uk.co.ribot.foodalike.data.remote.RibotsService;
import uk.co.ribot.foodalike.injection.ApplicationContext;
import uk.co.ribot.foodalike.injection.module.ApplicationModule;
import uk.co.ribot.foodalike.util.RxEventBus;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SyncService syncService);

    @ApplicationContext Context context();
    Application application();
    RibotsService ribotsService();
    PreferencesHelper preferencesHelper();
    DatabaseHelper databaseHelper();
    DataManager dataManager();
    RxEventBus eventBus();

}
