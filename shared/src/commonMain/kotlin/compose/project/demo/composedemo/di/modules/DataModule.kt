package compose.project.demo.composedemo.di.modules
import compose.project.demo.composedemo.data.remote.IRemoteRocketLaunchesDataSource
import compose.project.demo.composedemo.data.remote.RemoteRocketLaunchesDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import org.koin.dsl.module
// shared/src/commonMain/kotlin/compose/project/demo/composedemo/di/modules/DataModule.kt
val dataModule = module {
    single<IRemoteRocketLaunchesDataSource> {
        RemoteRocketLaunchesDataSource(
            get(),
            Dispatchers.IO
        )
    }
}