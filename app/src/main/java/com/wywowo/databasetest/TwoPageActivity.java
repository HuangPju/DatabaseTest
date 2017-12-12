package com.wywowo.databasetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.wywowo.databasetest.bean.User;
import com.wywowo.databasetest.greendao.UserDao;
import java.util.List;

public class TwoPageActivity extends AppCompatActivity implements View.OnClickListener {
    //声明各个按钮
    private Button createBtn;
    private Button insertBtn;
    private Button updateBtn;
    private Button queryBtn;
    private Button deleteBtn;
    private Button ModifyBtn;
    private Button two;
    UserDao userDao ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_page);
        //调用creatView方法
        creatView();
        //setListener方法
        setListener();

    }

    //通过findViewById获得Button对象的方法
    private void creatView(){
        createBtn = (Button)findViewById(R.id.createDatabase);
        updateBtn = (Button)findViewById(R.id.updateDatabase);
        insertBtn = (Button)findViewById(R.id.insert);
        ModifyBtn = (Button)findViewById(R.id.update);
        queryBtn = (Button)findViewById(R.id.query);
        deleteBtn = (Button)findViewById(R.id.delete);
        two = (Button)findViewById(R.id.two);

    }

    //为按钮注册监听的方法
    private void setListener(){
        createBtn.setOnClickListener(this);
        updateBtn.setOnClickListener(this);
        insertBtn.setOnClickListener(this);
        ModifyBtn.setOnClickListener(this);
        queryBtn.setOnClickListener(this);
        deleteBtn.setOnClickListener(this);
        two.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.createDatabase:

                break;
            case R.id.updateDatabase:
                break;
            case R.id.insert:
                userDao = MyApplication.getInstances().getDaoSession().getUserDao();
                User user = new User(null,"136455","花功夫");
                userDao.insert(user);
                break;
            case R.id.update:
                break;
            case R.id.query:
                userDao = MyApplication.getInstances().getDaoSession().getUserDao();
                List<User> users = userDao.loadAll();
                String userName = "";
                for (int i = 0; i < users.size(); i++) {
                    userName += users.get(i).getUsername()+",";
                }
                Log.d("tag","查询全部数据==>" + userName);
                break;
            case R.id.delete:
                break;
            case R.id.two:
                break;
        }
    }
}
