package com.mzx.server;

import com.mzx.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ZhenXinMa
 * @date 2020/1/21 14:39
 */
@Component
public class DeptServerFallBackFactory implements FallbackFactory<DeptServerFeign> {

    @Override
    public DeptServerFeign create(Throwable throwable) {
            return new DeptServerFeign() {
                @Override
                public List<Dept> findAll() {
                    return null;
                }

                @Override
                public Dept get(int id) {
                    return new Dept().setDname("该服务已经关闭")
                            .setDeptno(id)
                            .setDb_source("This ID"+id+"  No DataBaseSource");
                }
            };
        }
    }

