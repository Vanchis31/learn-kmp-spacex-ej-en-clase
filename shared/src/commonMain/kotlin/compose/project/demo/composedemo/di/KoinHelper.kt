package compose.project.demo.composedemo.di

import compose.project.demo.composedemo.di.modules.sharedModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.includes


fun initKoin(config: KoinAppDeclaration? = null): KoinApplication {
    return startKoin {
        includes(config)  // Extensiones específicas de plataforma
        modules(sharedModule)
    }
}