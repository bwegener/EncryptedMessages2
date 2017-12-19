package edu.orangecoastcollege.cs273.encryptedmessages;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mOriginalEditText;
    private TextView mEncryptedTextView;
    private TextView mDecryptedTextView;
    //TODO (1): Create member variables for the AESEncryption and RSAEncryption classes you created earlier


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mOriginalEditText = (EditText) findViewById(R.id.string_original);
        mEncryptedTextView = (TextView) findViewById(R.id.string_encrypted);
        mDecryptedTextView = (TextView) findViewById(R.id.string_decrypted);

        //TODO (2): Instantiate each of the AESEncryption and RSAEncryption objects

    }

    public void encryptAndDecryptAES(View v) {
        //TODO (3): Get the original text, encrypt it using the AESEncryption object
        //TODO (3): then put the result in the mEncryptedTextView.
        //TODO (3): Finally, decrypt the encrypted text and put the result in the mDecryptedTextView.

    }

    public void encryptAndDecryptRSA1(View v) {
        //TODO (4): Get the original text, encrypt it using the RSAEncryption object, using RSA1 (private, then public key)
        //TODO (4): then put the result in the mEncryptedTextView.
        //TODO (4): Finally, decrypt the encrypted text and put the result in the mDecryptedTextView.

    }

    public void encryptAndDecryptRSA2(View v) {
        //TODO (5): Get the original text, encrypt it using the RSAEncryption object, using RSA2 (public, then private key)
        //TODO (5): then put the result in the mEncryptedTextView.
        //TODO (5): Finally, decrypt the encrypted text and put the result in the mDecryptedTextView.

    }
}