package fev.management.api;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import fev.management.entity.*;
import fev.management.model.FevMemberCreate;
import fev.management.model.FevMemberModel;
import fev.management.repository.MemberPositionRepository;
import fev.management.repository.MemberStatusRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import fev.management.repository.MemberRepository;
@CrossOrigin
@Controller
public class MemberController implements BaseController<FevMember, FevMemberModel> {

    /**
     * For logging.
     */
    private final static Logger LOG = LoggerFactory.getLogger(EventController.class);

    private final String path = "/members";

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    MemberStatusRepository memberStatusRepository;

    @Autowired
    MemberPositionRepository memberPositionRepository;


    @GetMapping(path = path)
    @ResponseBody
    @Override
    public List<FevMember> getAll() {
        // TODO Auto-generated method stub
//        List<FevMember> list = (List<FevMember>) memberRepository.findAll();
        return (List<FevMember>) memberRepository.findAll();
    }

    // Get member By ID
    @GetMapping(path + "/{id}")
    @ResponseBody
    @Override
    public Optional<FevMember> getByID(@PathVariable("id") int id) {
        // TODO Auto-generated method stub
        return memberRepository.findById(id);
    }

    // Find members by name
    @GetMapping(path + "/name")
    @ResponseBody
    public List<FevMember> getByName(@RequestParam String name) {
        // TODO Auto-generated method stub
        return memberRepository.findByName(name);
    }

    @GetMapping(path + "/count")
    @ResponseBody
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return (int) memberRepository.count();
    }

    // Get member By ID
    @DeleteMapping(path + "/{id}")
    @ResponseBody
    @Override
    public void deleteByID(@PathVariable("id") int id) {
        memberRepository.deleteById(id);

    }

    // Create new member
    @PostMapping(path = path, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = {"application/json"})
    @ResponseBody
    @Override
    public void create(@RequestBody FevMemberModel member) {
        LOG.info("Postion: " + member.getPosition());
        ModelMapper mapper = new ModelMapper();
        FevMember fevMember = mapper.map(member, FevMember.class);
        //Update FevStatus and FevPosition
        FevMemberPosition pos = memberPositionRepository.findByPosition(member.getPosition());
        if (pos != null) {
            fevMember.setPosition(pos);
        }
        FevMemberStatus stt = memberStatusRepository.findByStatus(member.getStatus());
        if (stt != null) {
            fevMember.setStatus(stt);
        }
        LOG.info("After mapping: " + fevMember.getFullname());
        memberRepository.save(fevMember);
    }

    //Update member
    @PutMapping(path = path + "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    @Override
    public void update(@RequestBody FevMemberModel memberUpdate, @PathVariable("id") int id) {
        // TODO Auto-generated method stub
        FevMember member = memberRepository.findById(id).get();
        if (member == null) {
            return;
        } else {
            if (memberUpdate.getFullname() != null) {
                member.setFullname(memberUpdate.getFullname());
            }
            if (memberUpdate.getStudentID() != null) {
                member.setStudentID(memberUpdate.getStudentID());
            }
            if (memberUpdate.getBirthdate() != null) {
                member.setBirthdate(memberUpdate.getBirthdate());
            }
            if (memberUpdate.getSex() != null) {
                member.setSex(memberUpdate.getSex());
            }
            if (memberUpdate.getAddress() != null) {
                member.setAddress(memberUpdate.getAddress());
            }
            if (memberUpdate.getPhone() != null) {
                member.setPhone(memberUpdate.getPhone());
            }
            if (memberUpdate.getPosition() != null) {
                member.setPosition(memberPositionRepository.findByPosition(memberUpdate.getPosition()));
            }
            if (memberUpdate.getStatus() != null) {
                member.setStatus(memberStatusRepository.findByStatus(memberUpdate.getStatus()));
            }
            if (memberUpdate.getPoint() != null) {
                member.setPoint(memberUpdate.getPoint());
            }
            if (memberUpdate.getNote() != null) {
                member.setNote(memberUpdate.getNote());
            }
        }
        memberRepository.save(member);
    }

    @RequestMapping(value = path + "/fetch", method = RequestMethod.GET)
    public List<FevMember> getAllFetch(HttpServletRequest request, HttpServletResponse resp) {

        // TODO Auto-generated method stub
        return (List<FevMember>) memberRepository.findAll();
    }
}