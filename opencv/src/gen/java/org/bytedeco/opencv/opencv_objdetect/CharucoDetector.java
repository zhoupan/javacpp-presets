// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_objdetect;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

import static org.bytedeco.opencv.global.opencv_objdetect.*;


@Namespace("cv::aruco") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_objdetect.class)
public class CharucoDetector extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CharucoDetector(Pointer p) { super(p); }

    /** \brief Basic CharucoDetector constructor
     *
     * @param board ChAruco board
     * @param charucoParams charuco detection parameters
     * @param detectorParams marker detection parameters
     * @param refineParams marker refine detection parameters
     */
    public CharucoDetector(@Const @ByRef CharucoBoard board,
                                @Const @ByRef(nullValue = "cv::aruco::CharucoParameters()") CharucoParameters charucoParams,
                                @Const @ByRef(nullValue = "cv::aruco::DetectorParameters()") DetectorParameters detectorParams,
                                @Const @ByRef(nullValue = "cv::aruco::RefineParameters()") RefineParameters refineParams) { super((Pointer)null); allocate(board, charucoParams, detectorParams, refineParams); }
    private native void allocate(@Const @ByRef CharucoBoard board,
                                @Const @ByRef(nullValue = "cv::aruco::CharucoParameters()") CharucoParameters charucoParams,
                                @Const @ByRef(nullValue = "cv::aruco::DetectorParameters()") DetectorParameters detectorParams,
                                @Const @ByRef(nullValue = "cv::aruco::RefineParameters()") RefineParameters refineParams);
    public CharucoDetector(@Const @ByRef CharucoBoard board) { super((Pointer)null); allocate(board); }
    private native void allocate(@Const @ByRef CharucoBoard board);

    public native @Const @ByRef CharucoBoard getBoard();
    public native void setBoard(@Const @ByRef CharucoBoard board);

    public native @Const @ByRef CharucoParameters getCharucoParameters();
    public native void setCharucoParameters(@ByRef CharucoParameters charucoParameters);

    public native @Const @ByRef DetectorParameters getDetectorParameters();
    public native void setDetectorParameters(@Const @ByRef DetectorParameters detectorParameters);

    public native @Const @ByRef RefineParameters getRefineParameters();
    public native void setRefineParameters(@Const @ByRef RefineParameters refineParameters);

    /**
     * \brief detect aruco markers and interpolate position of ChArUco board corners
     * @param image input image necesary for corner refinement. Note that markers are not detected and
     * should be sent in corners and ids parameters.
     * @param charucoCorners interpolated chessboard corners.
     * @param charucoIds interpolated chessboard corners identifiers.
     * @param markerCorners vector of already detected markers corners. For each marker, its four
     * corners are provided, (e.g std::vector<std::vector<cv::Point2f> > ). For N detected markers, the
     * dimensions of this array should be Nx4. The order of the corners should be clockwise.
     * If markerCorners and markerCorners are empty, the function detect aruco markers and ids.
     * @param markerIds list of identifiers for each marker in corners.
     *  If markerCorners and markerCorners are empty, the function detect aruco markers and ids.
     *
     * This function receives the detected markers and returns the 2D position of the chessboard corners
     * from a ChArUco board using the detected Aruco markers.
     *
     * If markerCorners and markerCorners are empty, the detectMarkers() will run and detect aruco markers and ids.
     *
     * If camera parameters are provided, the process is based in an approximated pose estimation, else it is based on local homography.
     * Only visible corners are returned. For each corner, its corresponding identifier is also returned in charucoIds.
     * @see findChessboardCorners
     */
    public native void detectBoard(@ByVal Mat image, @ByVal Mat charucoCorners, @ByVal Mat charucoIds,
                                 @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") MatVector markerCorners,
                                 @ByVal(nullValue = "cv::InputOutputArray(cv::noArray())") Mat markerIds);
    public native void detectBoard(@ByVal Mat image, @ByVal Mat charucoCorners, @ByVal Mat charucoIds);
    public native void detectBoard(@ByVal Mat image, @ByVal Mat charucoCorners, @ByVal Mat charucoIds,
                                 @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") UMatVector markerCorners,
                                 @ByVal(nullValue = "cv::InputOutputArray(cv::noArray())") Mat markerIds);
    public native void detectBoard(@ByVal Mat image, @ByVal Mat charucoCorners, @ByVal Mat charucoIds,
                                 @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") GpuMatVector markerCorners,
                                 @ByVal(nullValue = "cv::InputOutputArray(cv::noArray())") Mat markerIds);
    public native void detectBoard(@ByVal UMat image, @ByVal UMat charucoCorners, @ByVal UMat charucoIds,
                                 @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") MatVector markerCorners,
                                 @ByVal(nullValue = "cv::InputOutputArray(cv::noArray())") UMat markerIds);
    public native void detectBoard(@ByVal UMat image, @ByVal UMat charucoCorners, @ByVal UMat charucoIds);
    public native void detectBoard(@ByVal UMat image, @ByVal UMat charucoCorners, @ByVal UMat charucoIds,
                                 @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") UMatVector markerCorners,
                                 @ByVal(nullValue = "cv::InputOutputArray(cv::noArray())") UMat markerIds);
    public native void detectBoard(@ByVal UMat image, @ByVal UMat charucoCorners, @ByVal UMat charucoIds,
                                 @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") GpuMatVector markerCorners,
                                 @ByVal(nullValue = "cv::InputOutputArray(cv::noArray())") UMat markerIds);
    public native void detectBoard(@ByVal GpuMat image, @ByVal GpuMat charucoCorners, @ByVal GpuMat charucoIds,
                                 @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") MatVector markerCorners,
                                 @ByVal(nullValue = "cv::InputOutputArray(cv::noArray())") GpuMat markerIds);
    public native void detectBoard(@ByVal GpuMat image, @ByVal GpuMat charucoCorners, @ByVal GpuMat charucoIds);
    public native void detectBoard(@ByVal GpuMat image, @ByVal GpuMat charucoCorners, @ByVal GpuMat charucoIds,
                                 @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") UMatVector markerCorners,
                                 @ByVal(nullValue = "cv::InputOutputArray(cv::noArray())") GpuMat markerIds);
    public native void detectBoard(@ByVal GpuMat image, @ByVal GpuMat charucoCorners, @ByVal GpuMat charucoIds,
                                 @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") GpuMatVector markerCorners,
                                 @ByVal(nullValue = "cv::InputOutputArray(cv::noArray())") GpuMat markerIds);

    /**
     * \brief Detect ChArUco Diamond markers
     *
     * @param image input image necessary for corner subpixel.
     * @param diamondCorners output list of detected diamond corners (4 corners per diamond). The order
     * is the same than in marker corners: top left, top right, bottom right and bottom left. Similar
     * format than the corners returned by detectMarkers (e.g std::vector<std::vector<cv::Point2f> > ).
     * @param diamondIds ids of the diamonds in diamondCorners. The id of each diamond is in fact of
     * type Vec4i, so each diamond has 4 ids, which are the ids of the aruco markers composing the
     * diamond.
     * @param markerCorners list of detected marker corners from detectMarkers function.
     * If markerCorners and markerCorners are empty, the function detect aruco markers and ids.
     * @param markerIds list of marker ids in markerCorners.
     * If markerCorners and markerCorners are empty, the function detect aruco markers and ids.
     *
     * This function detects Diamond markers from the previous detected ArUco markers. The diamonds
     * are returned in the diamondCorners and diamondIds parameters. If camera calibration parameters
     * are provided, the diamond search is based on reprojection. If not, diamond search is based on
     * homography. Homography is faster than reprojection, but less accurate.
     */
    public native void detectDiamonds(@ByVal Mat image, @ByVal MatVector diamondCorners, @ByVal Mat diamondIds,
                                    @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") MatVector markerCorners,
                                    @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") MatVector markerIds);
    public native void detectDiamonds(@ByVal Mat image, @ByVal MatVector diamondCorners, @ByVal Mat diamondIds);
    public native void detectDiamonds(@ByVal Mat image, @ByVal UMatVector diamondCorners, @ByVal Mat diamondIds,
                                    @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") UMatVector markerCorners,
                                    @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") UMatVector markerIds);
    public native void detectDiamonds(@ByVal Mat image, @ByVal UMatVector diamondCorners, @ByVal Mat diamondIds);
    public native void detectDiamonds(@ByVal Mat image, @ByVal GpuMatVector diamondCorners, @ByVal Mat diamondIds,
                                    @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") GpuMatVector markerCorners,
                                    @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") GpuMatVector markerIds);
    public native void detectDiamonds(@ByVal Mat image, @ByVal GpuMatVector diamondCorners, @ByVal Mat diamondIds);
    public native void detectDiamonds(@ByVal UMat image, @ByVal MatVector diamondCorners, @ByVal UMat diamondIds,
                                    @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") MatVector markerCorners,
                                    @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") MatVector markerIds);
    public native void detectDiamonds(@ByVal UMat image, @ByVal MatVector diamondCorners, @ByVal UMat diamondIds);
    public native void detectDiamonds(@ByVal UMat image, @ByVal UMatVector diamondCorners, @ByVal UMat diamondIds,
                                    @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") UMatVector markerCorners,
                                    @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") UMatVector markerIds);
    public native void detectDiamonds(@ByVal UMat image, @ByVal UMatVector diamondCorners, @ByVal UMat diamondIds);
    public native void detectDiamonds(@ByVal UMat image, @ByVal GpuMatVector diamondCorners, @ByVal UMat diamondIds,
                                    @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") GpuMatVector markerCorners,
                                    @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") GpuMatVector markerIds);
    public native void detectDiamonds(@ByVal UMat image, @ByVal GpuMatVector diamondCorners, @ByVal UMat diamondIds);
    public native void detectDiamonds(@ByVal GpuMat image, @ByVal MatVector diamondCorners, @ByVal GpuMat diamondIds,
                                    @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") MatVector markerCorners,
                                    @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") MatVector markerIds);
    public native void detectDiamonds(@ByVal GpuMat image, @ByVal MatVector diamondCorners, @ByVal GpuMat diamondIds);
    public native void detectDiamonds(@ByVal GpuMat image, @ByVal UMatVector diamondCorners, @ByVal GpuMat diamondIds,
                                    @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") UMatVector markerCorners,
                                    @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") UMatVector markerIds);
    public native void detectDiamonds(@ByVal GpuMat image, @ByVal UMatVector diamondCorners, @ByVal GpuMat diamondIds);
    public native void detectDiamonds(@ByVal GpuMat image, @ByVal GpuMatVector diamondCorners, @ByVal GpuMat diamondIds,
                                    @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") GpuMatVector markerCorners,
                                    @ByVal(nullValue = "cv::InputOutputArrayOfArrays(cv::noArray())") GpuMatVector markerIds);
    public native void detectDiamonds(@ByVal GpuMat image, @ByVal GpuMatVector diamondCorners, @ByVal GpuMat diamondIds);
}