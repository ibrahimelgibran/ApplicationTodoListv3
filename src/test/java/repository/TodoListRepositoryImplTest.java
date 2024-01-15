package repository;

import com.zaxxer.hikari.HikariDataSource;
import entity.Todolist;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.DatabaseUtil;

import javax.sql.DataSource;

public class TodoListRepositoryImplTest {

    private HikariDataSource dataSource;

    private TodoListRepository todoListRepository;

    @BeforeEach
    void setUp() {
        dataSource = DatabaseUtil.getDataSource();
        todoListRepository = new TodoListRepositoryImpl(dataSource);
    }

    @Test
    void testAdd() {
        Todolist todolist = new Todolist();
        todolist.setTodo("Gibran");

        todoListRepository.add(todolist);
    }

    @AfterEach
    void tearDown() {
        dataSource.close();
    }
}
