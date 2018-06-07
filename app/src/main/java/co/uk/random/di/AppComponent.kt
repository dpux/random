package co.uk.random.di

import android.app.Application
import co.uk.random.RandomApplication
import co.uk.random.di.module.RoomModule
import co.uk.random.di.module.YoutubeModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = [(AndroidSupportInjectionModule::class), (AndroidInjectionModule::class), (YoutubeModule::class),(RoomModule::class), (ActivityBuilder::class), (FragmentBuilder::class)]
)
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application): Builder

        fun build(): AppComponent
    }

    fun inject(fomApplication: RandomApplication)

}