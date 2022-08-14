package com.rosemaryapp.amazingspinner

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.widget.AppCompatAutoCompleteTextView

class AmazingSpinner//    constructor(context: Context, attrs: AttributeSet, defStyleAttr:Int, defStyleRes:Int) : super(context, attrs, R.style.Base_Widget_AppCompat_Spinner_Underlined) {
//        init(attrs,R.style.Base_Widget_AppCompat_Spinner_Underlined)
//    }
//    constructor(context: Context, attrs: AttributeSet) : super(context, attrs, R.style.Base_Widget_AppCompat_Spinner_Underlined) {
//        init(attrs,R.style.Base_Widget_AppCompat_Spinner_Underlined)
//    }
    (context: Context, attrs: AttributeSet) : AppCompatAutoCompleteTextView(
    context,
    attrs,
    R.style.Base_Widget_AppCompat_Spinner_Underlined
) {

    init {
        init(attrs, R.style.Base_Widget_AppCompat_Spinner_Underlined)
    }
//    constructor(context: Context) : super(context) {
//        init(null!!, R.style.Base_Widget_AppCompat_Spinner_Underlined)
//    }

    private fun init(attrs: AttributeSet, defStyle:Int) {

        val a = getContext().obtainStyledAttributes(attrs, R.styleable.AmazingSpinner, defStyle, 0)
        val fontName = a.getString(R.styleable.AmazingSpinner_mFontType)
        try
        {
            if (fontName != null)
            {
                val myTypeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/" + fontName)
                setTypeface(myTypeface)
            }

            isFocusable = false
            isFocusableInTouchMode = false
            inputType = 0

//            this.setOnClickListener {
//
//                this.showDropDown()
//            }

            setOnTouchListener(object :OnTouchListener{
                override fun onTouch(v: View?, p1: MotionEvent?): Boolean {
                    showDropDown()
                   return v!!.performClick()
                }

            })
        }
        catch (e:Exception) {
            e.printStackTrace()
        }
        a.recycle()

    }
}