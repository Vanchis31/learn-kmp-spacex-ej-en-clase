package compose.project.demo.composedemo.data.local

import compose.project.demo.composedemo.entity.RocketLaunch

interface ILocalRocketLaunchesDataSource {
    fun getAllLaunches(): List<RocketLaunch>

    fun clearAndCreateLaunches(launches: List<RocketLaunch>)
}