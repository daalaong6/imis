package com.iotch.cache;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisPoolWriper {
    /**
     * redis连接池对象
     */
    private JedisPool jedisPool;

    public JedisPoolWriper(final JedisPoolConfig poolConfig,final String hostname,final int port){
        try{
            jedisPool = new JedisPool(poolConfig,hostname,port);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 获得redis连接池对象
     * @return
     */
    public JedisPool getJedisPool() {
        return jedisPool;
    }

    /**
     * 注入redis连接池对象
     * @param jedisPool
     */
    public void setJedisPool(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }
}
