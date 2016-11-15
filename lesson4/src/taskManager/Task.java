package taskManager;

import java.time.LocalDateTime;

class Task {
    private LocalDateTime date;
    private String name;
    private String category;

    public Task(LocalDateTime date, String name, String category) {
        this.date = date;
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }

}