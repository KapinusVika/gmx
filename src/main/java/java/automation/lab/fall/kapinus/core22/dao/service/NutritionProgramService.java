package java.automation.lab.fall.kapinus.core22.dao.service;

import java.automation.lab.fall.kapinus.core22.constant.PropertyConstant;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import java.automation.lab.fall.kapinus.core22.dao.daoModel.NutritionProgramDAO;
import java.automation.lab.fall.kapinus.core22.dao.impl.mock.NutritionProgramDAOImpl;
import java.automation.lab.fall.kapinus.core22.domain.NutritionProgram;
import java.util.List;

public class NutritionProgramService extends BaseService {

    private static final DAO<NutritionProgram> NUTRITION_PROGRAM_DAO=
            NUTRITION_PROGRAM_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static NutritionProgram createClient(NutritionProgram nutritionProgram){
        return NUTRITION_PROGRAM_DAO.create(nutritionProgram);
    }

    public static NutritionProgram getClientById(Long id){
        return NUTRITION_PROGRAM_DAO.getById(id);
    }

    public static List<NutritionProgram> get(){
        return NUTRITION_PROGRAM_DAO.get();
    }

    public static NutritionProgram update(NutritionProgram nutritionProgram){
        return NUTRITION_PROGRAM_DAO.update(nutritionProgram);
    }

    public  static Long deleteById(Long id){
        return NUTRITION_PROGRAM_DAO.deleteById(id);
    }

}
