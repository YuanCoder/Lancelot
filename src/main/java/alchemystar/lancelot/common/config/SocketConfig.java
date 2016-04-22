/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package alchemystar.lancelot.common.config;

/**
 * SocketConfig
 *
 * @Author lizhuyang
 */
public interface SocketConfig {

    int Frontend_Socket_Recv_Buf = 4 * 1024 * 1024;
    int Frontend_Socket_Send_Buf = 1024 * 1024;
    int Backend_Socket_Recv_Buf = 4 * 1024 * 1024;
    int Backend_Socket_Send_Buf = 1024 * 1024;// mysql 5.6
}