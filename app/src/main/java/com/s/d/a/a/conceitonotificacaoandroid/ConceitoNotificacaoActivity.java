package com.s.d.a.a.conceitonotificacaoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.content.Intent;
import android.app.PendingIntent;
import android.media.RingtoneManager;
import android.net.Uri;

public class ConceitoNotificacaoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conceito_notificacao);
    }

    protected void enviarNotificacao(View view) {
        /**final String ChannelID = "my_channel_1";
        Uri somPadraodUri= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(this, ChannelID)
                        .setSmallIcon(android.R.drawable.ic_dialog_info)
                        .setContentTitle("Notificação")
                        .setContentText("Isso é um exemplo de notificação no Android!")
                        .setSound(somPadraodUri);

        Intent resultIntent = new Intent(this, ResultadoActivity.class);

        PendingIntent pendingIntent =
                PendingIntent.getActivity(
                        this,
                        0,
                        resultIntent,
                        PendingIntent.FLAG_UPDATE_CURRENT
                );

        NotificationCompat.Action action =
                new NotificationCompat.Action.Builder(
                        android.R.drawable.sym_action_chat,
                        "Abrir Notificação", pendingIntent)
                        .build();

        builder.addAction(action);

        builder.setContentIntent(pendingIntent);

        int IdNotificacao = 99;

        NotificationManager gerNotificacao = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        gerNotificacao.notify(IdNotificacao, builder.build());*/

        //Bundle Notifications - Definir um conjunto de notificações agregadas\agrupadas
        final String CHAVE_GRUPO_NOTIFICACAO = "chave_grupo_notificacao";
        final String ChannelID = "my_channel_1";

        NotificationCompat.Builder builderSumario =
                new NotificationCompat.Builder(this, ChannelID)
                        .setSmallIcon(android.R.drawable.ic_dialog_info)
                        .setContentTitle("Exemplo de Bundle Notifications")
                        .setContentText("Isso é um exemplo de Bundle Notifications!")
                        .setGroup(CHAVE_GRUPO_NOTIFICACAO)
                        .setGroupSummary(true);

        NotificationCompat.Builder builder1 =
                new NotificationCompat.Builder(this, ChannelID)
                        .setSmallIcon(android.R.drawable.ic_dialog_info)
                        .setContentTitle("Nova mensagem")
                        .setContentText("Você tem uma nova mensagem da Gloriana.")
                        .setGroup(CHAVE_GRUPO_NOTIFICACAO);

        NotificationCompat.Builder builder2 =
                new NotificationCompat.Builder(this, ChannelID)
                        .setSmallIcon(android.R.drawable.ic_dialog_info)
                        .setContentTitle("Nova mensagem")
                        .setContentText("Você tem uma nova mensagem da Julia.")
                        .setGroup(CHAVE_GRUPO_NOTIFICACAO);

        NotificationCompat.Builder builder3 =
                new NotificationCompat.Builder(this, ChannelID)
                        .setSmallIcon(android.R.drawable.ic_dialog_info)
                        .setContentTitle("Nova mensagem")
                        .setContentText("Você tem uma nova mensagem da Betina.")
                        .setGroup(CHAVE_GRUPO_NOTIFICACAO);

        int Id_Sumario_Notificacao = 111;
        int Id1Notificacao = 112;
        int Id2Notificacao = 113;
        int Id3Notificacao = 114;

        NotificationManager gerNotificacao = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        gerNotificacao.notify(Id1Notificacao, builder1.build());
        gerNotificacao.notify(Id2Notificacao, builder2.build());
        gerNotificacao.notify(Id3Notificacao, builder3.build());
        gerNotificacao.notify(Id_Sumario_Notificacao, builderSumario.build());
     }
}
