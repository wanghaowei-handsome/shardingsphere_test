package sharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <strong>Description : </strong> <br>
 * <p>
 * <strong>北京正源德标科技信息有限责任公司</strong> <br>
 * </p>
 * <br>
 *
 * @author : whw
 * @date : 2022年04月02日 10:40
 * 修改人 修改日期 修改描述<br>
 * -------------------------------------------<br>
 * <br>
 * <br>
 */
@SpringBootApplication
@MapperScan("sharding.mapper")
public class ShardingMain {

    public static void main(String[] args) {
        SpringApplication.run(ShardingMain.class);
    }

}
