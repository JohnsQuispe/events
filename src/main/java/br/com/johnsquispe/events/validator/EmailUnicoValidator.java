package br.com.johnsquispe.events.validator;

import br.com.johnsquispe.events.validator.annotation.EmailUnico;
import br.com.johnsquispe.events.vo.UserVO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailUnicoValidator  implements ConstraintValidator<EmailUnico, UserVO> {

    @Override
    public boolean isValid(UserVO userVO, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
