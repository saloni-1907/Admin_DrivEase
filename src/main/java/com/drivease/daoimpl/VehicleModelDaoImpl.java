package com.drivease.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.drivease.dao.VehicleModelDao;
import com.drivease.model.VehicleModel;
import com.drivease.util.DbUtility;

@Repository("vehicleModelDao")
public class VehicleModelDaoImpl extends GenericDaoImpl<VehicleModel>  implements VehicleModelDao {

	public List<VehicleModel> getAll(Class<VehicleModel> T) {
		// TODO Auto-generated method stub
		return null;
	}

	public VehicleModel getById(Class<VehicleModel> T, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<VehicleModel> getByFieldName(Class<VehicleModel> T, String fieldName, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	public VehicleModel saveObject(VehicleModel objectToSave) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean deleteObject(VehicleModel objectToDelete) {
		// TODO Auto-generated method stub
		return null;
	}

	public VehicleModel updateObject(VehicleModel objectToUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	public VehicleModel saveUpdateObject(VehicleModel objectToUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<VehicleModel> getByQuery(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<VehicleModel> getByCriteria(Criteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<VehicleModel> saveAllObjects(List<VehicleModel> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<VehicleModel> updateAllObjects(List<VehicleModel> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteByQuery(String query) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByQuery(String query) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<VehicleModel> getAll() {

		List<VehicleModel> list = DbUtility.getListData("SELECT m.modelId as modelId,"
				+ " m.modelName as modelName,m.companyId as companyId,"
				+ " c.companyName as companyName,t.vehicleTypeName as vehicleTypeName"
				+ " FROM vehicle_model m INNER JOIN vehicle_company c"
				+ " ON m.companyId = c.companyId INNER JOIN vehicle_type t ON"
				+ " m.vehicleTypeId = t.vehicleTypeId WHERE m.isDeleted=0 and c.isDeleted=0 and "
				+ " t.isDeleted=0", VehicleModel.class);
		return list;
		//return super.getByQuery("FROM VehicleModel vm WHERE vm.isDeleted=0");
	}

	public VehicleModel getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteModel(long id) {
		VehicleModel obj = super.getById(VehicleModel.class,id);
		obj.setIsDeleted(1);
		return super.updateObject(obj).getModelId()>0;
	}

	public long addModel(VehicleModel vehiclemodel) {
		
		VehicleModel new_obj =super.saveUpdateObject(vehiclemodel);
		return new_obj.getModelId();
	}

	public VehicleModel editModel(long id) {
		// TODO Auto-generated method stub
		return super.getById(VehicleModel.class, id);
	}

}
