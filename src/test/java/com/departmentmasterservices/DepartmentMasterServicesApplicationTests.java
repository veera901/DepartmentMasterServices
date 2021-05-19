package com.departmentmasterservices;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.departmentmasterservices.entities.Department;
import com.departmentmasterservices.entities.DepartmentReport;
import com.departmentmasterservices.repository.DeparmentReportRepository;
import com.departmentmasterservices.repository.DepartmentRepository;
import com.departmentmasterservices.services.IDepartmentMaster;
import com.departmentmasterservices.services.IDepartmentReport;

@SpringBootTest
class DepartmentMasterServicesApplicationTests {
	
	@Autowired
	private IDepartmentMaster dep;
	
	@MockBean
	private DepartmentRepository dao;
	
	@Test
void createDepartmentTest() throws Exception {
		
		Department d = new Department();
		d.setD_id(1);
		d.setD_name("Emergency");
		when(dao.save(d)).thenReturn(d);
		Department userToBeAdded = dep.createDepartment(d);
		assertEquals(true, userToBeAdded != null);
		
	}
	
	@Test
 void updateDepartmentTest() throws Exception {
		Department d = new Department();
		d.setD_id(1);
		d.setD_name("Emergency");
		when(dao.save(d)).thenReturn(d);
		assertEquals("Emergency", d.getD_name());
		
	}
	
	@Test
	void findByIdDepartmentTest() throws Exception {
		Department d = new Department();
		d.setD_id(1);
		d.setD_name("Emergency");
		assertFalse(dao.existsById(1));
	}



	@Autowired
	private IDepartmentReport dreport;
	
	@MockBean
	private DeparmentReportRepository drr;
	
	@Test
	void createDepartmentReportTest() throws Exception {
			
			DepartmentReport dr = new DepartmentReport();
			dr.setDreport_id(1);
			dr.setDreport_name("Emergency");
			when(drr.save(dr)).thenReturn(dr);
			DepartmentReport userToBeAdded = dreport.createDepartmentReport(dr);
			assertEquals(true, userToBeAdded != null);
			
		}
	
	@Test
	 void updateDepartmentReportTest() throws Exception {
			DepartmentReport dr = new DepartmentReport();
			dr.setDreport_id(1);
			dr.setDreport_name("Emergency");
			when(drr.save(dr)).thenReturn(dr);
			assertEquals("Emergency", dr.getDreport_name());
			
		}
	
	@Test
	void findByIdDepartmentReportTest() throws Exception {
		DepartmentReport dr = new DepartmentReport();
		dr.setDreport_id(1);
		dr.setDreport_name("Emergency");
		assertFalse(drr.existsById(1));
	}
	
	
}











