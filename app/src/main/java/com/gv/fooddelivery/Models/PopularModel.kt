package com.gv.fooddelivery.Models

import android.media.Image
import android.widget.ImageView

class PopularModel {

    private var foodImage: Int? = null
    private var foodName: String = ""
    private var foodPrice: Int=0
    private var foodPriceConstant: Int=0
    private var foodCount: Int = 1

constructor()
    constructor(foodImage:Int?, foodName:String, foodPrice:Int,foodPriceConstant:Int,foodCount:Int){
        this.foodImage=foodImage
        this.foodName=foodName
        this.foodPrice=foodPrice
        this.foodCount=foodCount
        this.foodPriceConstant=foodPriceConstant
    }
    fun getFoodPriceConstant():Int{
        return foodPriceConstant
    }
    fun setFoodPriceConstant(foodPriceConstant: Int){
        this.foodPriceConstant=foodPriceConstant
    }
    fun getFoodCount():Int{
        return foodCount
    }
     fun getFoodImage():Int?{
        return foodImage
    }
     fun getFoodName():String{
        return foodName
    }
     fun getFoodPrice():Int{
        return foodPrice
    }
    fun setFoodCount(foodCount: Int){
        this.foodCount=foodCount
    }
    fun setFoodImage(foodImage: Int?){
        this.foodImage
    }
     fun setFoodName(foodName: String){
        this.foodName
    }
     fun setFoodPrice(foodPrice: Int){
        this.foodPrice=foodPrice
    }

}