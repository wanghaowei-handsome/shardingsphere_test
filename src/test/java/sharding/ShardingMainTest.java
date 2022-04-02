package sharding;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sharding.entity.Course;
import sharding.mapper.CourseMapper;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingMainTest {

    @Autowired
    private CourseMapper courseMapper;

    @Test
    public void testCourse() {
        for (int i = 0; i < 10; i++) {
            Course course = new Course();
            course.setCname("张三" + i);
            course.setCstatus(i + "");
            course.setUserId((long) i);
            courseMapper.insert(course);
        }
    }

}
