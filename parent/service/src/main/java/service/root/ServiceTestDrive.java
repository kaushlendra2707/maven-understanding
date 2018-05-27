package service.root;

import common.root.model.CommonModelTest;

public class ServiceTestDrive {

	public static void main(String[] args) {
		CommonModelTest model = new CommonModelTest();
		model.setId("id");
		model.setName("name");
		model.setRollNo("roll");
		System.out.println(model);

	}

}
