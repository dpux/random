package co.uk.random.view.video

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import co.uk.random.R
import co.uk.random.view.DisposableDaggerFragment
import co.uk.random.view.playlist.PLaylistFragment
import javax.inject.Inject

class VideoFragment : DisposableDaggerFragment() {
    @Inject
    lateinit var videoViewModel: VideoViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View = inflater.inflate(R.layout.fragment_video, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        fun newInstance(): VideoFragment {
            return VideoFragment()
        }
    }
}
