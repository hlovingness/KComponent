package com.xiaojinzi.component.demo

import android.content.Intent
import com.xiaojinzi.component.anno.RouterDegradeAnno
import com.xiaojinzi.component.demo.module.default.view.DefaultAct
import com.xiaojinzi.component.impl.RouterDegrade
import com.xiaojinzi.component.impl.RouterRequest

@RouterDegradeAnno
class AppRouterGrade: RouterDegrade {

    override fun isMatch(request: RouterRequest): Boolean {
        return true
    }

    override fun onDegrade(request: RouterRequest): Intent {
        return Intent(request.rawAliveContext, DefaultAct::class.java)
    }

}