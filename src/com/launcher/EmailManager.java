package com.launcher;

import com.launcher.controller.services.FetchFoldersService;
import com.launcher.model.EmailAccount;
import com.launcher.model.EmailTreeItem;
import javafx.scene.control.TreeItem;

import javax.mail.Folder;

public class EmailManager {
    //Folder handling:

    private EmailTreeItem<String> foldersRoot= new EmailTreeItem<String>("");
    public EmailTreeItem<String> getFoldersRoot(){
        return foldersRoot;
    }


    public void addEmailAccount(EmailAccount emailAccount){
        EmailTreeItem<String> treeItem = new EmailTreeItem<String>(emailAccount.getAddress());
        FetchFoldersService fetchFoldersService= new FetchFoldersService(emailAccount.getStore(),treeItem);
        fetchFoldersService.start();
        foldersRoot.getChildren().add(treeItem);


    }
}
