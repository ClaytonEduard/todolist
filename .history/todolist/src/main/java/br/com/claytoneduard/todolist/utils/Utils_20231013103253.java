package br.com.claytoneduard.todolist.utils;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class Utils {

    // copiar tudo que nao for null
    public void copyNonNullProperties(Object source, Object target) {
        BeanUtils.copyProperties(source, target);
    }

    public String[] getNullPropertNames(Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);

        // obtendo as propriedades do objeto
        PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<>();
        for (PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) {
                emptyNames.add(pd.getName());
            }
        }

        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);

    }
}
