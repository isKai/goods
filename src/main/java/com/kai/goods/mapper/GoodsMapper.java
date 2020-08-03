package com.kai.goods.mapper;

import com.kai.goods.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public class GoodsMapper {
     String tableName = "goods";
     String insertField = "title, price, image, brand";
     String selectField = "id" + insertField;

    @Select({"select", selectField, "from", tableName})
    List<Goods> selectAll();


}
