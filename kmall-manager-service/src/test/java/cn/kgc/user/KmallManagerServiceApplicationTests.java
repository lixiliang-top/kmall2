package cn.kgc.user;

import cn.kgc.bean.PmsBaseCatalog1;
import cn.kgc.service.CatalogService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class KmallManagerServiceApplicationTests {

	@Resource
	CatalogService catalogService;

	@Test
	void contextLoads() {
		List<PmsBaseCatalog1> pmsBaseCatalog1s = catalogService.selectPmsBaseCataLog1All();
		for (PmsBaseCatalog1 pmsBaseCatalog1 : pmsBaseCatalog1s) {
			System.out.println(pmsBaseCatalog1.toString());
		}
	}

}
