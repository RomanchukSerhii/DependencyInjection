package com.example.dependencyinjectionstart.example1

class Component {
    private fun getComputer(): Computer {
        val keyboard = Keyboard()
        val memory = Memory()
        val monitor = Monitor()
        val mouse = Mouse()
        val processor = Processor()
        val storage = Storage()
        val computerTower = ComputerTower(storage, memory, processor)
        return Computer(monitor, keyboard, mouse, computerTower)
    }

    fun inject(activity: Activity) {
        activity.computer = getComputer()
    }
}