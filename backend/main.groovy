// main.groovy
import TodoList

def todo = new TodoList()

todo.addTask("Learn Groovy basics")
todo.addTask("Build a project with Groovy")
todo.addTask("Explore Gradle")

println "\nAll tasks:"
todo.showTasks()

todo.completeTask(0)

println "\nPending tasks: ${todo.pendingTasks.size()}"
todo.showTasks()
