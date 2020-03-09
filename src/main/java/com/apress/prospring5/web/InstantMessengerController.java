package com.apress.prospring5.web;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.apress.prospring5.util.Message;
import com.apress.prospring5.util.SingerGrid;
import com.apress.prospring5.util.UrlUtil;
import com.apress.prospring5.entities.Singer;
import com.apress.prospring5.services.SingerService;
import com.google.common.collect.Lists;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import javax.validation.Valid;

@RequestMapping("/im")
@Controller
public class InstantMessengerController {
    private final Logger logger = LoggerFactory.getLogger(InstantMessengerController.class);

//    private SingerService singerService;
    private MessageSource messageSource;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model uiModel) {
        logger.info("Instant Messenger Page");

//        List<Singer> singers = singerService.findAll();
//        uiModel.addAttribute("singers", singers);

//        logger.info("No. of singers: " + singers.size());

        return "instant_messenger/show";
    }

//     @Autowired
//    public void setSingerService(SingerService singerService) {
//        this.singerService = singerService;
//    }

    @Autowired
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
}
