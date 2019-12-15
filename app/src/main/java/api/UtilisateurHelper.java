package api;

import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

import modules.Utilisateur;

public class UtilisateurHelper
{
    private static  final  String  collection_name="Utilisateurs";
     public static CollectionReference getUtilisateurCollection()
     {
         return FirebaseFirestore.getInstance().collection(collection_name);
     }
    public static Task<Void> AddUtilisateur(String first_name,String last_name,int n_cin,String password )
    {
        Utilisateur user= new Utilisateur(first_name,last_name,n_cin,password);
        String cin=Integer.toString(n_cin);
        return UtilisateurHelper.getUtilisateurCollection().document(cin).set(user);
    }



}
