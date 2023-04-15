package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Computer(
    monitor: Monitor,
    keyboard: Keyboard,
    mouse: Mouse,
    computerTower: ComputerTower
)
