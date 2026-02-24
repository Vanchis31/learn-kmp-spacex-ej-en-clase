package compose.project.demo.composedemo.di

import org.koin.core.module.Module

actual fun platformModule(): Module = module {
    single { DriverFactory() }
}
