package com.manning.graina.hubbub;

public interface RemotePostService extends java.rmi.Remote {
    long createPost(String userId, String content) throws java.rmi.RemoteException;
}
