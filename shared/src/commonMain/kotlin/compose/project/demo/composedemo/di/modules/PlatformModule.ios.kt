package compose.project.demo.composedemo.di.modules
import org.koin.dsl.module
actual fun platformModule(): Module = module {
    single { DriverFactory() }
}