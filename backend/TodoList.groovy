// TodoList.groovy
import Task

class TodoList {
    List<Task> tasks = []

    def addTask(String description) {
        tasks << new Task(description: description)
        println "Added: ${description}"
    }

    def completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks[index].completed = true
            println "Completed: ${tasks[index].description}"
        }
    }

    def showTasks() {
        tasks.eachWithIndex { task, i ->
            def status = task.completed ? "x" : " "
            println "${i}. [${status}] ${task.description}"
        }
    }

    def getPendingTasks() {
        tasks.findAll { !it.completed }
    }
}
