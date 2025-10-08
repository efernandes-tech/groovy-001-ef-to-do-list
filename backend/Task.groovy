// Task.groovy
@groovy.transform.Canonical
class Task {
    String description
    boolean completed = false
    Date createdAt = new Date()
}
