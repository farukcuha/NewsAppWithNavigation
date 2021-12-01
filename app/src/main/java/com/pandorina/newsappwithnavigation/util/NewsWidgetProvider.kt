package com.pandorina.newsappwithnavigation.util

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.os.Bundle
import android.widget.RemoteViews
import androidx.navigation.NavDeepLinkBuilder
import com.pandorina.newsappwithnavigation.R

class NewsWidgetProvider : AppWidgetProvider() {

    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        // There may be multiple widgets active, so update all of them
        for (appWidgetId in appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId)
        }
    }

    override fun onEnabled(context: Context) {
        // Enter relevant functionality for when the first widget is created
    }

    override fun onDisabled(context: Context) {
        // Enter relevant functionality for when the last widget is disabled
    }
}

internal fun updateAppWidget(
    context: Context,
    appWidgetManager: AppWidgetManager,
    appWidgetId: Int
) {
    val views = RemoteViews(context.packageName, R.layout.news_widget_layout)
    createPendingIntentToNews(views, context, R.id.news1, 5)
    createPendingIntentToNews(views, context, R.id.news_2, 7)
    createPendingIntentToNews(views, context, R.id.news_3, 12)
    createPendingIntentToNews(views, context, R.id.news4, 22)
    appWidgetManager.updateAppWidget(appWidgetId, views)

}

fun createPendingIntentToNews(
    remoteViews: RemoteViews,
    context: Context,
    newsLayoutId: Int,
    newsId: Int
) {
    val args = Bundle()
    args.putInt("newsId", newsId)
    val pendingIntent = NavDeepLinkBuilder(context)
        .setGraph(R.navigation.mobile_navigation)
        .setDestination(R.id.nav_detail)
        .setArguments(args)
        .createPendingIntent()

    remoteViews.setOnClickPendingIntent(newsLayoutId, pendingIntent)
}