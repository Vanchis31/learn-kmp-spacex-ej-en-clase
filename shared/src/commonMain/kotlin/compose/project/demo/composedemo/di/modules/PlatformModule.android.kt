package compose.project.demo.composedemo.di.modules
import org.koin.dsl.module
import kotlin.coroutines.EmptyCoroutineContext.get

actual fun platformModule(): Module = module {
    single { DriverFactory(get()) }
}