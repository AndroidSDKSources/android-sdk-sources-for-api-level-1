// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MediaStore.java

package android.provider;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package android.provider:
//			BaseColumns

public final class MediaStore
{
	public static final class Video
	{
		public static final class Media
			implements VideoColumns
		{

			public static final Uri INTERNAL_CONTENT_URI = null;
			public static final Uri EXTERNAL_CONTENT_URI = null;
			public static final String CONTENT_TYPE = "vnd.android.cursor.dir/video";
			public static final String DEFAULT_SORT_ORDER = "title";

			public static Uri getContentUri(String volumeName)
			{
				throw new RuntimeException("Stub!");
			}


			public Media()
			{
				throw new RuntimeException("Stub!");
			}
		}

		public static interface VideoColumns
			extends MediaColumns
		{

			public static final String DURATION = "duration";
			public static final String ARTIST = "artist";
			public static final String ALBUM = "album";
			public static final String RESOLUTION = "resolution";
			public static final String DESCRIPTION = "description";
			public static final String IS_PRIVATE = "isprivate";
			public static final String TAGS = "tags";
			public static final String CATEGORY = "category";
			public static final String LANGUAGE = "language";
			public static final String LATITUDE = "latitude";
			public static final String LONGITUDE = "longitude";
			public static final String DATE_TAKEN = "datetaken";
			public static final String MINI_THUMB_MAGIC = "mini_thumb_magic";
		}


		public static final String DEFAULT_SORT_ORDER = "name ASC";

		public static final Cursor query(ContentResolver cr, Uri uri, String projection[])
		{
			throw new RuntimeException("Stub!");
		}

		public Video()
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static final class Audio
	{
		public static final class Albums
			implements BaseColumns, AlbumColumns
		{

			public static final Uri INTERNAL_CONTENT_URI = null;
			public static final Uri EXTERNAL_CONTENT_URI = null;
			public static final String CONTENT_TYPE = "vnd.android.cursor.dir/albums";
			public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/album";
			public static final String DEFAULT_SORT_ORDER = "album_key";

			public static Uri getContentUri(String volumeName)
			{
				throw new RuntimeException("Stub!");
			}


			public Albums()
			{
				throw new RuntimeException("Stub!");
			}
		}

		public static interface AlbumColumns
		{

			public static final String ALBUM_ID = "album_id";
			public static final String ALBUM = "album";
			public static final String ARTIST = "artist";
			public static final String NUMBER_OF_SONGS = "numsongs";
			public static final String FIRST_YEAR = "minyear";
			public static final String LAST_YEAR = "maxyear";
			public static final String ALBUM_KEY = "album_key";
			public static final String ALBUM_ART = "album_art";
		}

		public static final class Artists
			implements BaseColumns, ArtistColumns
		{
			public static final class Albums
				implements AlbumColumns
			{

				public static final Uri getContentUri(String volumeName, long artistId)
				{
					throw new RuntimeException("Stub!");
				}

				public Albums()
				{
					throw new RuntimeException("Stub!");
				}
			}


			public static final Uri INTERNAL_CONTENT_URI = null;
			public static final Uri EXTERNAL_CONTENT_URI = null;
			public static final String CONTENT_TYPE = "vnd.android.cursor.dir/artists";
			public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/artist";
			public static final String DEFAULT_SORT_ORDER = "artist_key";

			public static Uri getContentUri(String volumeName)
			{
				throw new RuntimeException("Stub!");
			}


			public Artists()
			{
				throw new RuntimeException("Stub!");
			}
		}

		public static interface ArtistColumns
		{

			public static final String ARTIST = "artist";
			public static final String ARTIST_KEY = "artist_key";
			public static final String NUMBER_OF_ALBUMS = "number_of_albums";
			public static final String NUMBER_OF_TRACKS = "number_of_tracks";
		}

		public static final class Playlists
			implements BaseColumns, PlaylistsColumns
		{
			public static final class Members
				implements AudioColumns
			{

				public static final String _ID = "_id";
				public static final String CONTENT_DIRECTORY = "members";
				public static final String AUDIO_ID = "audio_id";
				public static final String PLAYLIST_ID = "playlist_id";
				public static final String PLAY_ORDER = "play_order";
				public static final String DEFAULT_SORT_ORDER = "play_order";

				public static final Uri getContentUri(String volumeName, long playlistId)
				{
					throw new RuntimeException("Stub!");
				}

				public Members()
				{
					throw new RuntimeException("Stub!");
				}
			}


			public static final Uri INTERNAL_CONTENT_URI = null;
			public static final Uri EXTERNAL_CONTENT_URI = null;
			public static final String CONTENT_TYPE = "vnd.android.cursor.dir/playlist";
			public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/playlist";
			public static final String DEFAULT_SORT_ORDER = "name";

			public static Uri getContentUri(String volumeName)
			{
				throw new RuntimeException("Stub!");
			}


			public Playlists()
			{
				throw new RuntimeException("Stub!");
			}
		}

		public static interface PlaylistsColumns
		{

			public static final String NAME = "name";
			public static final String DATA = "_data";
			public static final String DATE_ADDED = "date_added";
			public static final String DATE_MODIFIED = "date_modified";
		}

		public static final class Genres
			implements BaseColumns, GenresColumns
		{
			public static final class Members
				implements AudioColumns
			{

				public static final String CONTENT_DIRECTORY = "members";
				public static final String DEFAULT_SORT_ORDER = "title";
				public static final String AUDIO_ID = "audio_id";
				public static final String GENRE_ID = "genre_id";

				public static final Uri getContentUri(String volumeName, long genreId)
				{
					throw new RuntimeException("Stub!");
				}

				public Members()
				{
					throw new RuntimeException("Stub!");
				}
			}


			public static final Uri INTERNAL_CONTENT_URI = null;
			public static final Uri EXTERNAL_CONTENT_URI = null;
			public static final String CONTENT_TYPE = "vnd.android.cursor.dir/genre";
			public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/genre";
			public static final String DEFAULT_SORT_ORDER = "name";

			public static Uri getContentUri(String volumeName)
			{
				throw new RuntimeException("Stub!");
			}


			public Genres()
			{
				throw new RuntimeException("Stub!");
			}
		}

		public static interface GenresColumns
		{

			public static final String NAME = "name";
		}

		public static final class Media
			implements AudioColumns
		{

			public static final Uri INTERNAL_CONTENT_URI = null;
			public static final Uri EXTERNAL_CONTENT_URI = null;
			public static final String CONTENT_TYPE = "vnd.android.cursor.dir/audio";
			public static final String DEFAULT_SORT_ORDER = "title";
			public static final String RECORD_SOUND_ACTION = "android.provider.MediaStore.RECORD_SOUND";

			public static Uri getContentUri(String volumeName)
			{
				throw new RuntimeException("Stub!");
			}

			public static Uri getContentUriForPath(String path)
			{
				throw new RuntimeException("Stub!");
			}


			public Media()
			{
				throw new RuntimeException("Stub!");
			}
		}

		public static interface AudioColumns
			extends MediaColumns
		{

			public static final String TITLE_KEY = "title_key";
			public static final String DURATION = "duration";
			public static final String ARTIST_ID = "artist_id";
			public static final String ARTIST = "artist";
			public static final String ARTIST_KEY = "artist_key";
			public static final String COMPOSER = "composer";
			public static final String ALBUM_ID = "album_id";
			public static final String ALBUM = "album";
			public static final String ALBUM_KEY = "album_key";
			public static final String ALBUM_ART = "album_art";
			public static final String TRACK = "track";
			public static final String YEAR = "year";
			public static final String IS_MUSIC = "is_music";
			public static final String IS_RINGTONE = "is_ringtone";
			public static final String IS_ALARM = "is_alarm";
			public static final String IS_NOTIFICATION = "is_notification";
		}


		public static String keyFor(String name)
		{
			throw new RuntimeException("Stub!");
		}

		public Audio()
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static final class Images
	{
		public static class Thumbnails
			implements BaseColumns
		{

			public static final Uri INTERNAL_CONTENT_URI = null;
			public static final Uri EXTERNAL_CONTENT_URI = null;
			public static final String DEFAULT_SORT_ORDER = "image_id ASC";
			public static final String DATA = "_data";
			public static final String IMAGE_ID = "image_id";
			public static final String KIND = "kind";
			public static final int MINI_KIND = 1;
			public static final int FULL_SCREEN_KIND = 2;
			public static final int MICRO_KIND = 3;
			public static final String WIDTH = "width";
			public static final String HEIGHT = "height";

			public static final Cursor query(ContentResolver cr, Uri uri, String projection[])
			{
				throw new RuntimeException("Stub!");
			}

			public static final Cursor queryMiniThumbnails(ContentResolver cr, Uri uri, int kind, String projection[])
			{
				throw new RuntimeException("Stub!");
			}

			public static final Cursor queryMiniThumbnail(ContentResolver cr, long origId, int kind, String projection[])
			{
				throw new RuntimeException("Stub!");
			}

			public static Uri getContentUri(String volumeName)
			{
				throw new RuntimeException("Stub!");
			}


			public Thumbnails()
			{
				throw new RuntimeException("Stub!");
			}
		}

		public static final class Media
			implements ImageColumns
		{

			public static final Uri INTERNAL_CONTENT_URI = null;
			public static final Uri EXTERNAL_CONTENT_URI = null;
			public static final String CONTENT_TYPE = "vnd.android.cursor.dir/image";
			public static final String DEFAULT_SORT_ORDER = "name ASC";

			public static final Cursor query(ContentResolver cr, Uri uri, String projection[])
			{
				throw new RuntimeException("Stub!");
			}

			public static final Cursor query(ContentResolver cr, Uri uri, String projection[], String where, String orderBy)
			{
				throw new RuntimeException("Stub!");
			}

			public static final Cursor query(ContentResolver cr, Uri uri, String projection[], String selection, String selectionArgs[], String orderBy)
			{
				throw new RuntimeException("Stub!");
			}

			public static final Bitmap getBitmap(ContentResolver cr, Uri url)
				throws FileNotFoundException, IOException
			{
				throw new RuntimeException("Stub!");
			}

			public static final String insertImage(ContentResolver cr, String imagePath, String name, String description)
				throws FileNotFoundException
			{
				throw new RuntimeException("Stub!");
			}

			public static final String insertImage(ContentResolver cr, Bitmap source, String title, String description)
			{
				throw new RuntimeException("Stub!");
			}

			public static Uri getContentUri(String volumeName)
			{
				throw new RuntimeException("Stub!");
			}


			public Media()
			{
				throw new RuntimeException("Stub!");
			}
		}

		public static interface ImageColumns
			extends MediaColumns
		{

			public static final String DESCRIPTION = "description";
			public static final String PICASA_ID = "picasa_id";
			public static final String IS_PRIVATE = "isprivate";
			public static final String LATITUDE = "latitude";
			public static final String LONGITUDE = "longitude";
			public static final String DATE_TAKEN = "datetaken";
			public static final String ORIENTATION = "orientation";
			public static final String MINI_THUMB_MAGIC = "mini_thumb_magic";
			public static final String BUCKET_ID = "bucket_id";
			public static final String BUCKET_DISPLAY_NAME = "bucket_display_name";
		}


		public Images()
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static interface MediaColumns
		extends BaseColumns
	{

		public static final String DATA = "_data";
		public static final String SIZE = "_size";
		public static final String DISPLAY_NAME = "_display_name";
		public static final String TITLE = "title";
		public static final String DATE_ADDED = "date_added";
		public static final String DATE_MODIFIED = "date_modified";
		public static final String MIME_TYPE = "mime_type";
	}


	public static final String AUTHORITY = "media";
	public static final String MEDIA_SCANNER_VOLUME = "volume";

	public MediaStore()
	{
		throw new RuntimeException("Stub!");
	}

	public static Uri getMediaScannerUri()
	{
		throw new RuntimeException("Stub!");
	}
}
