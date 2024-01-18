public class Manager {
    private final Task[] tasks;
    private final Epic[] epics;
    private final Subtask[] subtasks;

    public Manager(Task[] tasks, Epic[] epics, Subtask[] subtasks) {
        this.tasks = tasks;
        this.epics = epics;
        this.subtasks = subtasks;
    }

    public Task getById(int id) {
        for (Task task : tasks) {
            if (task != null && task.getId() == id) {
                return task;
            }
        }

        for (Epic epic : epics) {
            if (epic != null && epic.getId() == id) {
                return epic;
            }
        }

        for (Subtask subtask : subtasks) {
            if (subtask != null && subtask.getId() == id) {
                return subtask;
            }
        }
        return null;
    }

    public void update(int id, String newStatus) {
        Task task = getById(id);
        if (task == null) {
            return;
        }
        task.setStatus(newStatus);
    }

    public void removeById(int id) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] != null && tasks[i].getId() == id) {
                tasks[i] = null;
                System.out.println("Задача с id=" + id + " была удалена!");
                return;
            }
        }

        for (int i = 0; i < epics.length; i++) {
            if (epics[i] != null && epics[i].getId() == id) {
                epics[i] = null;
                System.out.println("Эпик с id=" + id + " был удален!");
                return;
            }
        }

        for (int i = 0; i < subtasks.length; i++) {
            if (subtasks[i] != null && subtasks[i].getId() == id) {
                subtasks[i] = null;
                System.out.println("Подзадача с id=" + id + " была удалена!");
                return;
            }
        }

        System.out.println("Задача с id=" + id + " не найден!");
    }

    public void add(Task task) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] == null) {
                tasks[i] = task;
                return;
            }
        }

    }

    public void add(Subtask subtask) {
        for (int i = 0; i < subtasks.length; i++) {
            if (subtasks[i] == null) {
                subtasks[i] = subtask;
                return;
            }
        }
    }

    public void add(Epic epic) {
        for (int i = 0; i < epics.length; i++) {
            if (epics[i] == null) {
                epics[i] = epic;
                return;
            }
        }
    }

    public void printAll() {
        System.out.println("Задачи:");
        for (Task task : tasks) {
            if (task != null) {
                System.out.println(" идентификатор: " + task.getId());
                System.out.println(" название: " + task.getTitle());
                System.out.println();
            }
        }


        System.out.println("\nЭпики:");
        for (Epic epic : epics) {
            if (epic != null) {
                System.out.println(" идентификатор: " + epic.getId());
                System.out.println(" название: " + epic.getTitle());
                System.out.println();
            }
        }


        System.out.println("\nПодзадачи:");
        for (Subtask subtask : subtasks) {
            if (subtask != null) {
                System.out.println(" идентификатор: " + subtask.getId());
                System.out.println(" название: " + subtask.getTitle());
                System.out.println();
            }
        }
    }


    public Task[] getTasks() {
        return tasks;
    }

    public Epic[] getEpics() {
        return epics;
    }

    public Subtask[] getSubtasks() {
        return subtasks;
    }
}
