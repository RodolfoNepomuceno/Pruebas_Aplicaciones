package com.example.rodolfovargas.pruebas_aplicaciones;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

/**
 * Created by RodolfoVargas on 24/09/14. Como pruebas de aplicaciones
 */
public class logon_java extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        // Set the message to display.
        builder.setMessage("Are you sure?");

        // Set a listener to be invoked when the positive button of the dialog
        // is pressed.
        builder.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(getActivity(), "Yes", Toast.LENGTH_SHORT).show();
            }
        });

        // Set a listener to be invoked when the negative button of the dialog
        // is pressed.
        builder.setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(getActivity(), "No", Toast.LENGTH_SHORT).show();
            }
        });

        // Create the AlertDialog object and return it
        return builder.create();
    }
}

