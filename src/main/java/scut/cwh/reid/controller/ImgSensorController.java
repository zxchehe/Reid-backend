package scut.cwh.reid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import scut.cwh.reid.config.FileServerProperties;
import scut.cwh.reid.domain.Greeting;
import scut.cwh.reid.domain.VisionInfo;


@RequestMapping("/sensor")
@Controller
public class ImgSensorController {
    @PostMapping(value = "/img")
    public @ResponseBody
    String recordImg(VisionInfo visionInfo) {
        //TODO save img file to disk and store path info
        return new FileServerProperties().getHost();
    }


}