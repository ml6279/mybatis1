package market.dao.Impl;

import market.Utils.MybatisFactory;
import market.dao.DynamicSQL;
import market.entity.Batis;
import market.entity.EasybuyOrder;
import market.entity.NewsUser;
import org.apache.ibatis.session.SqlSession;
import java.util.*;

public class DynamicSQLImpl implements DynamicSQL {
    @Override
    public List<EasybuyOrder> queryOrder1(Map<String, Object> where) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            return ds.queryOrder1(where);
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public List<EasybuyOrder> queryOrder2(Map<String, Object> where) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            return ds.queryOrder2(where);
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public void updateOrder(EasybuyOrder order) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            ds.updateOrder(order);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public List<EasybuyOrder> queryOrder3(Map<String, Object> where) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            return ds.queryOrder3(where);
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public void updateOrder1(EasybuyOrder order) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            ds.updateOrder1(order);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public List<EasybuyOrder> queryOrder4(Map<String, Object> where) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            return ds.queryOrder4(where);
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public List<EasybuyOrder> queryOrder5(Object[] where) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            return ds.queryOrder5(where);
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public List<EasybuyOrder> queryOrder6(List<Object> list) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            return ds.queryOrder6(list);
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public List<EasybuyOrder> queryOrder7(Map<String, Object> where) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            return ds.queryOrder7(where);
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public void addRecordBatch(List<NewsUser> list) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            ds.addRecordBatch(list);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public void addRecordBatch1(List<Batis> list) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            ds.addRecordBatch1(list);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }


    public static void main(String[] args) {
        DynamicSQL ds = new DynamicSQLImpl();
        //if
        /*Map<String,Object> map = new HashMap<>();
        map.put("loginName","??????");
        map.put("serialNumber","111111111");
        System.out.println(ds.queryOrder1(map));*/

        //if where
        /*Map<String,Object> map = new HashMap<>();
        map.put("loginName","??????");
        map.put("serialNumber","111111111");
        System.out.println(ds.queryOrder2(map));*/

        //set if
        /*EasybuyOrder easybuyOrder = new EasybuyOrder();
        easybuyOrder.setLoginName("??????");
        easybuyOrder.setId(1);
        ds.updateOrder(easybuyOrder);*/

        //trim ?????? where ??? if ??????
        Map<String,Object> map = new HashMap<>();
        map.put("loginName","??????");
        map.put("serialNumber","111111111");
        map.put("from",0);
        map.put("pageSize",5);
        System.out.println(ds.queryOrder3(map));

        //trim ?????? set ??? if ??????
        /*EasybuyOrder easybuyOrder = new EasybuyOrder();
        easybuyOrder.setLoginName("??????");
        easybuyOrder.setId(1);
        ds.updateOrder1(easybuyOrder);*/

        //choose
        /*Map<String,Object> map = new HashMap<>();
        map.put("loginName","??????");
        map.put("serialNumber","111111111");
        System.out.println(ds.queryOrder4(map));*/

        ////foreach ??????????????????????????????
        /*String[] where = new String[1];
        where[0] = "??????";
        System.out.println(ds.queryOrder5(where));*/

        //foreach ???list??????????????????
        /*List<Object> list = new ArrayList<>();
        list.add("??????");
        ds.queryOrder6(list);
        System.out.println(list);*/

        //foreach map ??????list??????????????????
        /*Map<String,Object> where = new HashMap<>();
        where.put("ctime","2020-04-01");
        List<String> list = new ArrayList<>();
        list.add("??????");
        list.add("??????");
        where.put("list",list);
        List<EasybuyOrder> list1 = ds.queryOrder7(where);
        System.out.println(list1);*/

        //????????????
        /*List<NewsUser> list = new ArrayList<>();
        list.add(new NewsUser("??????","1111"));
        list.add(new NewsUser("??????","2222"));
        ds.addRecordBatch(list);*/

        //????????????
        /*List<Batis> list = new ArrayList<>();
        list.add(new Batis(10,"??????",new Date(),"??????"));
        list.add(new Batis(11,"??????",new Date(),"??????"));
        ds.addRecordBatch1(list);*/



    }
}
