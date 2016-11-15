package taskManager;

/**
 * Created by danil on 14.11.2016.
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

import static java.time.LocalDate.*;


class TaskManagerRealization implements TaskManager {

    private Map<LocalDateTime, Task> taskByDate = new HashMap<>();
    @Override
    public void add(LocalDateTime date, Task task) {
        taskByDate.put(date, task);
    }

    @Override
    public void remove(LocalDateTime date){
            taskByDate.remove(date);
        }

    @Override
    public Set<String> getCategories() {
            Set<String> categories = new TreeSet<>();
            for (Task t : taskByDate.values()) {
                categories.add(t.getCategory());
            }
            return categories;
    }

    @Override
    public Map<String, List<Task>> getTasksByCategories(String... categories) {
        Map<String, List<Task>> tasksByCategory = new HashMap<>();
        for (String category : categories) {
            tasksByCategory.put(category,getTasksByCategory(category));
        }
        return null;
    }

    @Override
    public List<Task> getTasksByCategory(String category) {
        List<Task> categoryTasks = new ArrayList<>();

        for (Task task : taskByDate.values()) {
            if (category == task.getCategory()) {
                categoryTasks.add(task);
            }
        }
        return categoryTasks;
    }

    @Override
    public List<Task> getTasksForToday() {
        List<Task> tasksForToday = new ArrayList<>();
        for (Task task : taskByDate.values()) {
            if (task.getDate().toLocalDate().equals(LocalDate.now())) {
                tasksForToday.add(task);
            }
        }
        return tasksForToday;
    }

}

